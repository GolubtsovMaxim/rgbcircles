package mg.rgbcircles;

/**
 * Created by Максим on 03.04.2016.
 */
public interface ICanvasView {
    void drawCircle(SimpleCircle circle);

    void reDraw();

    void showMessage(String text);
}
