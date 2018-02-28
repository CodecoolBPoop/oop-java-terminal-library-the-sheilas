package com.codecool.termlib;

public class Terminal {
    private static final String CONTROL_CODE = "\033[";
    private static final String CLEAR = "2J";
    private static final String MOVE = "H";
    private static final String STYLE = "m";

    public void resetStyle() {
    }

    public void clearScreen() {
    }

    public void moveTo(Integer x, Integer y) {
    }

    public void setColor(Color color) {
    }

    public void setBgColor(Color color) {
    }

    public void setUnderline() {
    }

    public void moveCursor(Direction direction, Integer amount) {
    }

    public void setChar(char c) {
    }

    private void command(String commandString) {
    }
}
