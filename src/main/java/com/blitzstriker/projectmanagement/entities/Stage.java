package com.blitzstriker.projectmanagement.entities;

public enum Stage {
    NOTSTARTED("Not Started"),
    COMPLETED("Completed"),
    INPROGRESS("In Progress");

    private final String displayValue;

    private Stage(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
