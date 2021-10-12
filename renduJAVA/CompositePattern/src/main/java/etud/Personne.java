package etud;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

/** Représente une personne */
public class Personne {

	/** La position en X */
	private double x;
	/** La position en Y */
	private double y;

	/**
	 * Construit une personne.
	 *
	 * @param nom     son nom
	 * @param x       sa position initiale en X
	 * @param y       sa position initiale en Y
	 * @param couleur sa couleur
	 */
	public Personne(String nom, double x, double y, String couleur) {
		super(nom, couleur);
		this.x = x;
		this.y = y;
		setMaForme(new Circle(0, 0, 10, Color.valueOf(couleur)));
		getMaForme().setTranslateX(x);
		getMaForme().setTranslateY(y);
	}

	public void deplacer() {
		// Ajouter un déplacement
		x += 10;
		getMaForme().setTranslateX(x);
	}

}
