package com.example.state.practice;

public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour==12)
            context.changeState(LunchState.getInstance());
        else if (hour < 8 || 20 <= hour)
            context.changeState(NightState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库(白天)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（白天）");
        context.changeState(EmergencyState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话（白天）");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
