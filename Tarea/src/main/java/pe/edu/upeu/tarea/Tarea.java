/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.tarea;

import pe.edu.upeu.tarea.decorator.Circle;
import pe.edu.upeu.tarea.decorator.Rectangle;
import pe.edu.upeu.tarea.decorator.RedShapeDecorator;
import pe.edu.upeu.tarea.decorator.Shape;

/**
 *
 * @author Hp
 */
public class Tarea {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
