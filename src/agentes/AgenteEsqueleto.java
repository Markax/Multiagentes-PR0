/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;

import jade.core.Agent;
import GUI.AgenteDemoJFrame;
import jade.core.behaviours.TickerBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;

/**
 *
 * @author pedroj
 * Esqueleto de agente para la estructura general que deben tener todos los
 * agentes
 */
public class AgenteEsqueleto extends Agent {
    //Variables del agente
    private AgenteDemoJFrame myGui;
    private int ejecuciones;
    
    @Override
    protected void setup() {
       //Inicialización de las variables del agente
       ejecuciones = 0;
       
       //Configuración del GUI
       myGui = new AgenteDemoJFrame(this);
       myGui.setVisible(true);
       myGui.presentarSalida("Soy " + this.getName() + "\n");
       //Registro del agente en las Páginas Amarrillas
       
       //Registro de la Ontología
       
       System.out.println("Soy " + this.getName() + "\n");
       myGui.presentarSalida("Hola soy el agente esqueleto :^)\n");
       //Añadir las tareas principales
    }

    @Override
    protected void takeDown() {
       //Desregristo del agente de las Páginas Amarillas
       
       //Liberación de recursos, incluido el GUI
       
       //Despedida
       myGui.dispose();
       System.out.println("Finaliza la ejecución del agente: " + this.getName());
       
    }
    
    //Métodos de trabajo del agente
    
    
    //Clases internas que representan las tareas del agente
      
}
