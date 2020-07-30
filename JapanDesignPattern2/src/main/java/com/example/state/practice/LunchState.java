package com.example.state.practice;

public class LunchState implements State{
    private static final LunchState singleton = new LunchState();

    private LunchState(){}

    public static LunchState getInstance(){
        return  singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour != 12){
            if (hour >= 8 && 20 > hour)
                context.changeState(DayState.getInstance());
            else
                context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("紧急：中午使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.recordLog("通知：按下警铃（中午）");
        context.changeState(EmergencyState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("呼叫报警中心（中午）");
    }

    @Override
    public String toString() {
        return "[午餐]";
    }
}
