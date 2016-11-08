package guiProgramming.taskOne;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZEICHENFLAECHE {
    private static ZEICHENFLAECHE zeichenflaeche;
    private JFrame fenster = new JFrame("Grafikdokument");
    private ZEICHENFLAECHE.MalPanel malPanel;
    private BufferedImage hintergrundbild;
    private Graphics2D gDC;
    private List<ZEICHENFLAECHE.Grafiksymbol> alleSymbole;

    private ZEICHENFLAECHE() {
        this.fenster.setLocation(50, 50);
        this.fenster.setResizable(false);
        this.fenster.setDefaultCloseOperation(3);
        JPanel contentPane = (JPanel)this.fenster.getContentPane();
        this.malPanel = new ZEICHENFLAECHE.MalPanel();
        this.malPanel.setPreferredSize(new Dimension(400, 300));
        contentPane.add(this.malPanel);
        this.fenster.pack();
        GraphicsConfiguration gfxConf = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        this.hintergrundbild = gfxConf.createCompatibleImage(this.malPanel.getWidth(), this.malPanel.getHeight());
        this.gDC = this.hintergrundbild.createGraphics();
        this.loeschen();
        this.alleSymbole = new ArrayList();
        this.fenster.setVisible(true);
        this.fenster.toFront();
    }

    public static ZEICHENFLAECHE ObjektGeben() {
        if(zeichenflaeche == null) {
            zeichenflaeche = new ZEICHENFLAECHE();
        }

        return zeichenflaeche;
    }

    public int anmelden(ZEICHENFLAECHE.SymbolArt was) {
        this.alleSymbole.add(new ZEICHENFLAECHE.Grafiksymbol(was));
        return this.alleSymbole.size();
    }

    public void zeichnen(int kennung, int aktX, int aktY, int aktBreite, int aktHoehe, String aktFarbe, boolean aktSichtbar) {
        if(kennung >= 1 && kennung <= this.alleSymbole.size()) {
            ZEICHENFLAECHE.Grafiksymbol symbol = (ZEICHENFLAECHE.Grafiksymbol)this.alleSymbole.get(kennung - 1);
            symbol.x = Math.max(aktX, 0);
            symbol.y = Math.max(aktY, 0);
            symbol.w = Math.max(aktBreite, 0);
            symbol.h = Math.max(aktHoehe, 0);
            symbol.farbe = aktFarbe;
            symbol.sichtbar = aktSichtbar;
            this.alleZeichnen();
        }

    }

    private void alleZeichnen() {
        this.loeschen();
        Iterator i$ = this.alleSymbole.iterator();

        while(i$.hasNext()) {
            ZEICHENFLAECHE.Grafiksymbol symbol = (ZEICHENFLAECHE.Grafiksymbol)i$.next();
            if(symbol.sichtbar) {
                symbol.draw();
            }
        }

        this.malPanel.repaint();
    }

    private void loeschen() {
        Color aktuell = this.gDC.getColor();
        this.gDC.setColor(Color.WHITE);
        this.gDC.fillRect(0, 0, this.hintergrundbild.getWidth(), this.hintergrundbild.getHeight());
        this.gDC.setColor(aktuell);
    }

    public void zeichenfarbeSetzen(String farbname) {
        if(farbname.equals("rot")) {
            this.gDC.setColor(Color.red);
        } else if(farbname.equals("gruen")) {
            this.gDC.setColor(Color.green);
        } else if(farbname.equals("blau")) {
            this.gDC.setColor(Color.blue);
        } else if(farbname.equals("gelb")) {
            this.gDC.setColor(Color.yellow);
        } else if(farbname.equals("cyan")) {
            this.gDC.setColor(Color.cyan);
        } else if(farbname.equals("magenta")) {
            this.gDC.setColor(Color.magenta);
        } else if(farbname.equals("schwarz")) {
            this.gDC.setColor(Color.black);
        } else if(farbname.equals("weiss")) {
            this.gDC.setColor(Color.white);
        } else if(farbname.equals("hellgelb")) {
            this.gDC.setColor(new Color(255, 255, 128));
        } else if(farbname.equals("hellgruen")) {
            this.gDC.setColor(new Color(128, 255, 128));
        } else if(farbname.equals("orange")) {
            this.gDC.setColor(new Color(255, 128, 0));
        } else if(farbname.equals("braun")) {
            this.gDC.setColor(new Color(128, 64, 0));
        } else {
            this.gDC.setColor(Color.black);
        }

    }

    private class Grafiksymbol {
        int x = 0;
        int y = 0;
        int w = 0;
        int h = 0;
        ZEICHENFLAECHE.SymbolArt sArt;
        String farbe;
        boolean sichtbar;

        Grafiksymbol(ZEICHENFLAECHE.SymbolArt art) {
            this.sArt = art;
            this.farbe = "weiss";
            this.sichtbar = false;
        }

        public void draw() {
            ZEICHENFLAECHE.this.zeichenfarbeSetzen(this.farbe);
            if(this.sArt == ZEICHENFLAECHE.SymbolArt.artKreis) {
                ZEICHENFLAECHE.this.gDC.fillOval(this.x, this.y, this.w, this.h);
            } else {
                int[] punkteX;
                int[] punkteY;
                if(this.sArt == ZEICHENFLAECHE.SymbolArt.artDreieck) {
                    punkteX = new int[]{this.x, this.x + this.w / 2, this.x - this.w / 2};
                    punkteY = new int[]{this.y, this.y + this.h, this.y + this.h};
                    ZEICHENFLAECHE.this.gDC.fillPolygon(punkteX, punkteY, 3);
                } else if(this.sArt == ZEICHENFLAECHE.SymbolArt.artViereck) {
                    ZEICHENFLAECHE.this.gDC.fillRect(this.x, this.y, this.w, this.h);
                } else if(this.sArt == ZEICHENFLAECHE.SymbolArt.artSechseck) {
                    System.out.println("ja");
                    punkteX = new int[]{this.x + (int)Math.round(0.2113D * (double)this.w), this.x + (int)Math.round(0.7887D * (double)this.w), this.x + this.w, this.x + (int)Math.round(0.7887D * (double)this.w), this.x + (int)Math.round(0.2113D * (double)this.w), this.x};
                    punkteY = new int[]{this.y, this.y, this.y + this.h / 2, this.y + this.h, this.y + this.h, this.y + this.h / 2};
                    System.out.println(punkteX.toString());
                    System.out.println(punkteY.toString());
                    ZEICHENFLAECHE.this.gDC.fillPolygon(punkteX, punkteY, 6);
                }
            }

        }
    }

    private class MalPanel extends JPanel {
        private MalPanel() {
        }

        public void paint(Graphics g) {
            g.drawImage(ZEICHENFLAECHE.this.hintergrundbild, 0, 0, (ImageObserver)null);
        }
    }

    public static enum SymbolArt {
        artKreis,
        artDreieck,
        artViereck,
        artSechseck;

        private SymbolArt() {
        }
    }
}
