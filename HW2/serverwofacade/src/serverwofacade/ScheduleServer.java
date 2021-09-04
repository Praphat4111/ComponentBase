/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

/**
 *
 * @author sarun
 */
public class ScheduleServer {

    private static ScheduleServer  schedule = null;

    public static ScheduleServer getScheduleObj(){
        if(schedule == null){
            schedule = new ScheduleServer();
        }
        return schedule;  
    }
    public void Startwork(){
        Start start = new Start();
        start.startBooting();
        start.readSystemConfigFile();
        start.init();
        start.initializeContext();
        start.initializeListeners();
        start.createSystemObjects();
    }

    public void Afterwork(){
        AfterStart after = new AfterStart();
        after.releaseProcesses();
        after.destory();
        after.destroySystemObjects();
        after.destoryListeners();
        after.destoryContext();
        after.shutdown();
    }
}
