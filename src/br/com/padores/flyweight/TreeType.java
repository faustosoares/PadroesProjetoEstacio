package br.com.padores.flyweight;

import java.awt.*;

/**Flyweight: Contém dados que duplicados para as árvores
 * 
 * Agora, em vez de armazenar os mesmos dados em milhares de objetos Tree, 
 * vamos fazer referência a um dos objetos flyweight com um conjunto específico de valores.
 *
 */
public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}