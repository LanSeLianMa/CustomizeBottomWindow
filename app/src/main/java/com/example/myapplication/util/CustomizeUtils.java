package com.example.myapplication.util;

/**
 * 自定义的工具类型、方法 合集
 */
public class CustomizeUtils {

    // 防止快速点击
    public static class AntiShake {

        private int minTime = 1000;

        // 两次点击间隔不能少于1000ms
        private int MIN_DELAY_TIME;

        private long lastClickTime = 0;

        public AntiShake(int minTime) {
            this.minTime = minTime;
            MIN_DELAY_TIME = minTime;
        }

        public boolean isFastClick() {
            boolean flag = true;
            long currentClickTime = System.currentTimeMillis();
            if ((currentClickTime - lastClickTime) < MIN_DELAY_TIME) {
                flag = false;
            }
            lastClickTime = currentClickTime;
            return flag;
        }

    }

}
