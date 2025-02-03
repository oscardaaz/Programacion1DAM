import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongGame extends JPanel implements ActionListener, KeyListener {

    // Tamaño de la ventana
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    // Variables para la pelota
    int ballX = WIDTH / 2, ballY = HEIGHT / 2;
    int ballDX = 4, ballDY = 6;
    int ballSize = 20;

    // Variables para las paletas (barras laterales)
    int paddleWidth = 20, paddleHeight = 100;
    int leftPaddleY = HEIGHT / 2 - paddleHeight / 2;
    int rightPaddleY = HEIGHT / 2 - paddleHeight / 2;
    int paddleSpeed = 20;

    // Puntuación
    int leftScore = 0, rightScore = 0;

    // Temporizador para la animación
    Timer timer;

    public PongGame() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(this);

        // Inicia el temporizador que actualiza la pantalla cada 10ms
        timer = new Timer(10, this);
        timer.start();
    }

    // Método para dibujar todos los componentes
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la pelota
        g.setColor(Color.WHITE);
        g.fillOval(ballX, ballY, ballSize, ballSize);

        // Dibuja las paletas
        g.fillRect(0, leftPaddleY, paddleWidth, paddleHeight); // Paleta izquierda
        g.fillRect(WIDTH - paddleWidth, rightPaddleY, paddleWidth, paddleHeight); // Paleta derecha

        // Dibuja la puntuación
        g.setFont(new Font("Arial", Font.PLAIN, 50));
        g.drawString(String.valueOf(leftScore), WIDTH / 4, 50);
        g.drawString(String.valueOf(rightScore), 3 * WIDTH / 4, 50);
    }

    // Método para actualizar la lógica del juego
    @Override
    public void actionPerformed(ActionEvent e) {
        // Movimiento de la pelota
        ballX += ballDX;
        ballY += ballDY;

        // Colisión con los bordes superior e inferior
        if (ballY <= 0 || ballY + ballSize >= HEIGHT) {
            ballDY = -ballDY;
        }

        // Colisión con las paletas
        if (ballX <= paddleWidth && ballY >= leftPaddleY && ballY <= leftPaddleY + paddleHeight) {
            ballDX = -ballDX;
        }

        if (ballX >= WIDTH - paddleWidth - ballSize && ballY >= rightPaddleY && ballY <= rightPaddleY + paddleHeight) {
            ballDX = -ballDX;
        }

        // Si la pelota se sale de la pantalla por la izquierda
        if (ballX <= 0) {
            rightScore++;
            resetBall();
        }

        // Si la pelota se sale de la pantalla por la derecha
        if (ballX >= WIDTH) {
            leftScore++;
            resetBall();
        }

        // Actualiza la pantalla
        repaint();
    }

    // Método para reiniciar la posición de la pelota después de un gol
    public void resetBall() {
        ballX = WIDTH / 2;
        ballY = HEIGHT / 2;
        ballDX = -ballDX; // Cambio de dirección
        ballDY = (int) (Math.random() * 4) - 2; // Dirección aleatoria en el eje Y
    }

    // Método para mover las paletas con las teclas
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        // Movimiento de la paleta izquierda
        if (keyCode == KeyEvent.VK_W && leftPaddleY > 0) {
            leftPaddleY -= paddleSpeed; // Mueve hacia arriba
        }
        if (keyCode == KeyEvent.VK_S && leftPaddleY + paddleHeight < HEIGHT) {
            leftPaddleY += paddleSpeed; // Mueve hacia abajo
        }

        // Movimiento de la paleta derecha
        if (keyCode == KeyEvent.VK_UP && rightPaddleY > 0) {
            rightPaddleY -= paddleSpeed; // Mueve hacia arriba
        }
        if (keyCode == KeyEvent.VK_DOWN && rightPaddleY + paddleHeight < HEIGHT) {
            rightPaddleY += paddleSpeed; // Mueve hacia abajo
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        // Crear la ventana y el panel del juego
        JFrame frame = new JFrame("Pong Game");
        PongGame pongGame = new PongGame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(pongGame);
        frame.pack();
        frame.setVisible(true);
    }
}