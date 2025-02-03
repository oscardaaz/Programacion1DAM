import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.ArrayList;

public class SpaceInvaders extends JPanel implements ActionListener {

    private int playerX = 300, playerY = 550; // Coordenadas de la nave
    private final int playerWidth = 50, playerHeight = 50;
    private final int playerSpeed = 10;

    private ArrayList<Rectangle> bullets = new ArrayList<>();
    private ArrayList<Rectangle> enemies = new ArrayList<>();
    private final int enemyWidth = 40, enemyHeight = 40;
    private final int enemySpeed = 2;
    
    private Timer gameTimer;
    private int score = 0;

    public SpaceInvaders() {
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (playerX > 0) playerX -= playerSpeed;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (playerX < getWidth() - playerWidth) playerX += playerSpeed;
                }
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    shootBullet();
                }
            }
        });

        gameTimer = new Timer(16, this); // Aproximadamente 60 FPS
        gameTimer.start();
        spawnEnemies();
    }

    private void shootBullet() {
        bullets.add(new Rectangle(playerX + playerWidth / 2 - 5, playerY, 10, 20));
    }

    private void spawnEnemies() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                enemies.add(new Rectangle(50 + j * 60, 30 + i * 50, enemyWidth, enemyHeight));
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveBullets();
        moveEnemies();
        checkCollisions();
        repaint();
    }

    private void moveBullets() {
        ArrayList<Rectangle> toRemove = new ArrayList<>();
        for (Rectangle bullet : bullets) {
            bullet.y -= 10; // Movimiento de las balas hacia arriba
            if (bullet.y < 0) {
                toRemove.add(bullet);
            }
        }
        bullets.removeAll(toRemove);
    }

    private void moveEnemies() {
        ArrayList<Rectangle> toRemove = new ArrayList<>();
        for (Rectangle enemy : enemies) {
            enemy.y += enemySpeed;
            if (enemy.y > getHeight()) {
                // Game over si un enemigo llega al fondo
                System.out.println("Game Over!");
                System.exit(0);
            }
        }
    }

    private void checkCollisions() {
        ArrayList<Rectangle> toRemoveEnemies = new ArrayList<>();
        ArrayList<Rectangle> toRemoveBullets = new ArrayList<>();

        for (Rectangle bullet : bullets) {
            for (Rectangle enemy : enemies) {
                if (bullet.intersects(enemy)) {
                    toRemoveEnemies.add(enemy);
                    toRemoveBullets.add(bullet);
                    score += 10; // Puntaje por destruir un enemigo
                }
            }
        }

        enemies.removeAll(toRemoveEnemies);
        bullets.removeAll(toRemoveBullets);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la nave del jugador
        g.setColor(Color.GREEN);
        g.fillRect(playerX, playerY, playerWidth, playerHeight);

        // Dibuja los disparos
        g.setColor(Color.YELLOW);
        for (Rectangle bullet : bullets) {
            g.fillRect(bullet.x, bullet.y, bullet.width, bullet.height);
        }

        // Dibuja los enemigos
        g.setColor(Color.RED);
        for (Rectangle enemy : enemies) {
            g.fillRect(enemy.x, enemy.y, enemy.width, enemy.height);
        }

        // Dibuja el puntaje
        g.setColor(Color.WHITE);
        g.drawString("Puntaje: " + score, 10, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Space Invaders");
        SpaceInvaders game = new SpaceInvaders();
        frame.add(game);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
