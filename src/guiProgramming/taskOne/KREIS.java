package guiProgramming.taskOne;

import guiProgramming.taskOne.ZEICHENFLAECHE.SymbolArt;

public class KREIS {
    private int mittelpunktX = 30;
    private int mittelpunktY = 60;
    private int radius = 20;
    private String fuellfarbe = "blau";
    private boolean sichtbar = true;
    private int kennung;

    public KREIS() {
        this.kennung = ZEICHENFLAECHE.ObjektGeben().anmelden(SymbolArt.artKreis);
        this.Zeichnen();
    }

    public void MittelpunktSetzen(int neuesX, int neuesY) {
        this.mittelpunktX = neuesX;
        this.mittelpunktY = neuesY;
        this.Zeichnen();
    }

    public void RadiusSetzen(int neuerRadius) {
        this.radius = neuerRadius;
        this.Zeichnen();
    }

    public void FarbeSetzen(String neueFarbe) {
        this.fuellfarbe = neueFarbe;
        this.Zeichnen();
    }

    public void SichtbarSetzen(boolean neueSichtbarkeit) {
        this.sichtbar = neueSichtbarkeit;
        this.Zeichnen();
    }

    public void Zeichnen() {
        ZEICHENFLAECHE.ObjektGeben().zeichnen(this.kennung, this.mittelpunktX - this.radius, this.mittelpunktY - this.radius, 2 * this.radius, 2 * this.radius, this.fuellfarbe, this.sichtbar);
    }
}
