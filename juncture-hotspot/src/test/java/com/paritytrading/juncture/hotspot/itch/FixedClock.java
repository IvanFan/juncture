package com.paritytrading.juncture.hotspot.itch;

class FixedClock implements Clock {

    private long currentTimeMillis;

    @Override
    public long currentTimeMillis() {
        return currentTimeMillis;
    }

    public void setCurrentTimeMillis(long currentTimeMillis) {
        this.currentTimeMillis = currentTimeMillis;
    }

}
