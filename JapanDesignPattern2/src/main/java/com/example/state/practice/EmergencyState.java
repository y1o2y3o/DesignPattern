package com.example.state.practice;

public class EmergencyState implements State {
    private static final EmergencyState singleton = new EmergencyState();

    private EmergencyState(){}

    public static EmergencyState getInstance(){
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {

    }

    @Override
    public void doUse(Context context) {
        context.recordLog("紧急状态：使用金库!!");
    }

    @Override
    public void doAlarm(Context context) {
        context.recordLog("紧急状态：按下警铃!!");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("紧急状态：呼叫报警中心!!");
    }

    @Override
    public String toString() {
        return " [紧急] ";
    }
}
