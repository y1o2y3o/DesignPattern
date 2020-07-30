package com.example.state.demo;

public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && 17 > hour)
            context.changeState(DayState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("紧急：晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（晚上）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
