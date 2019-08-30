/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.util.ArrayList;
import net.java.games.input.Component;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;

/**
 *
 * @author darkm
 */
public class Controlador_Control {
    private ArrayList<Controller> foundControllers;
    Controller controller;
    Component[] components;
    Controlador_FRM_Juego controlador_FRM_Juego;
    public Controlador_Control(Controlador_FRM_Juego controlador_FRM_Juego) {
        this.controlador_FRM_Juego=controlador_FRM_Juego;
        foundControllers = new ArrayList<>();
        searchForControllers();
        if(!foundControllers.isEmpty())
        {
            encontrarControl();
        }
    }

    /**
     * Search (and save) for controllers of type Controller.Type.STICK,
     * Controller.Type.GAMEPAD, Controller.Type.WHEEL and Controller.Type.FINGERSTICK.
     */
    private void searchForControllers() {
        Controller[] controllers = ControllerEnvironment.getDefaultEnvironment().getControllers();
        for(int i = 0; i < controllers.length; i++){
            Controller controller = controllers[i];
            if (
                    controller.getType() == Controller.Type.STICK || 
                    controller.getType() == Controller.Type.GAMEPAD || 
                    controller.getType() == Controller.Type.WHEEL ||
                    controller.getType() == Controller.Type.FINGERSTICK
               )
            {
                // Add new controller to the list of all controllers.
                foundControllers.add(controller);
            }
        }
    }
    public void encontrarControl()
    {
        for(int contador=0;contador<foundControllers.size();contador++)
        {
            if(foundControllers.get(contador).getName().equals("2-Axis,8-Button  "))
            {
                controller=foundControllers.get(contador);
                components = controller.getComponents();
                controlador_FRM_Juego.setControlEncontrado(true);
            }
        }
    }
    
    /**
     * Starts showing controller data on the window.
     */
    private void startShowingControllerData(){
            // Pull controller for current data, and break while loop if controller is disconnected.
            if( !controller.poll() ){
                controlador_FRM_Juego.setControlEncontrado(false);
            }
            
            // X axis and Y axis
            int xAxisPercentage = 0;
            int yAxisPercentage = 0;
            for(int i=0; i < components.length; i++)
            {
                Component component = components[i];
                Component.Identifier componentIdentifier = component.getIdentifier();
                
                // Buttons
                //if(component.getName().contains("Button")){ // If the language is not english, this won't work.
                if(componentIdentifier.getName().matches("^[0-9]*$")){ // If the component identifier name contains only numbers, then this is a button.
                    // Is button pressed?
                    boolean isItPressed = true;
                    if(component.getPollData() == 0.0f)
                        isItPressed = false;
                    if(isItPressed)
                        controlador_FRM_Juego.recibirBoton(Integer.parseInt(componentIdentifier.getName()));
                }
                
                // Axes
                if(component.isAnalog()){
                    float axisValue = component.getPollData();
                    int axisValueInPercentage = getAxisValueInPercentage(axisValue);
                    
                    // X axis
                    if(componentIdentifier == Component.Identifier.Axis.X){
                        xAxisPercentage = axisValueInPercentage;
                        controlador_FRM_Juego.recibirX(xAxisPercentage);
                    }
                    // Y axis
                    if(componentIdentifier == Component.Identifier.Axis.Y){
                        yAxisPercentage = axisValueInPercentage;
                        controlador_FRM_Juego.recibirY(yAxisPercentage);
                    }
                }
            }
    }
        /**
     * Given value of axis in percentage.
     * Percentages increases from left/top to right/bottom.
     * If idle (in center) returns 50, if joystick axis is pushed to the left/top 
     * edge returns 0 and if it's pushed to the right/bottom returns 100.
     * 
     * @return value of axis in percentage.
     */
    public int getAxisValueInPercentage(float axisValue)
    {
        return (int)(((2 - (1 - axisValue)) * 100) / 2);
    }
    
    public void verComponentes()
    {
        startShowingControllerData();
    }
}
