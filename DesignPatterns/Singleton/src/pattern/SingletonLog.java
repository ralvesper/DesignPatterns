/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

/**
 *
 * @author dyego
 */
public class SingletonLog {
    // Construtor privado. Suprime o construtor público padrao.
     private SingletonLog() {
     // Leitura da configuração de log. Normalmente descrita em um arquivo.
     }

     // Faz o log de eventos da aplicacao
     public void doLog(String eventDescription) {

     }

     //Retorna a instância única da classe SingletonLog
     public static SingletonLog getInstance() {
         return SingletonLogHolder.instance;
     }

     //Classe auxiliar para criacao da instancia. Evita problemas de sincronizacao de threads.
     private static class SingletonLogHolder {
            private static SingletonLog instance = new SingletonLog();
     }
 }
