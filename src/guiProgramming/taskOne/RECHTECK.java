package guiProgramming.taskOne;

import guiProgramming.taskOne.ZEICHENFLAECHE.SymbolArt;

public class RECHTECK {
    private int positionX = 60;
    private int positionY = 50;
    private int breite = 60;
    private int hoehe = 30;
    private String fuellfarbe = "rot";
    private boolean sichtbar = true;
    private int kennung;

    public RECHTECK() {
        this.kennung = ZEICHENFLAECHE.ObjektGeben().anmelden(SymbolArt.artViereck);
        this.Zeichnen();
    }

    public void PositionSetzen(int NeuesX, int NeuesY) {
        this.positionX = NeuesX;
        this.positionY = NeuesY;
        this.Zeichnen();
    }

    public void GroesseSetzen(int neueBreite, int neueHoehe) {
        this.breite = neueBreite;
        this.hoehe = neueHoehe;
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
        ZEICHENFLAECHE.ObjektGeben().zeichnen(this.kennung, this.positionX, this.positionY, this.breite, this.hoehe, this.fuellfarbe, this.sichtbar);
    }
}
