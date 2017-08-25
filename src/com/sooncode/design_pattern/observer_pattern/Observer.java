package com.sooncode.design_pattern.observer_pattern;
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}