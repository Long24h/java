package view;

import java.util.Scanner;

public abstract class ViewTemplate {
    protected Scanner scanner = new Scanner(System.in);
    public ViewTemplate(){
        showPage();
    }
    protected void showHeader(){
        System.out.println("Hello guys! Nice to meet you! Hope you have a nice day! :D");
        System.out.println("----------------------------------------------------------");
    }
    protected void showFooter(){
        System.out.println("-----------------");
        System.out.println("Amazing good job!");
    }
    protected abstract void showBody();
    protected void showPage(){
        showHeader();
        showBody();
        showFooter();
    }
}
