package org.kickerelo.kickerelo.data;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Ergebnis2vs2 {
    @Id
    @Column(name = "ID")
    private long id;

    @ManyToOne
    @JoinColumn(name = "GEWINNER_VORN")
    private Spieler gewinnerVorn;

    @ManyToOne
    @JoinColumn(name = "GEWINNER_HINTEN")
    private Spieler gewinnerHinten;

    @ManyToOne
    @JoinColumn(name = "VERLIERER_VORN")
    private Spieler verliererVorn;

    @ManyToOne
    @JoinColumn(name = "VERLIERER_HINTEN")
    private Spieler verliererHinten;

    @Column(name = "TORE_VERLIERER")
    private short toreVerlierer;

    @Column(name = "ZEITPUNKT")
    private LocalDateTime timestamp;

    public Ergebnis2vs2() {
    }

    public Ergebnis2vs2(Spieler gewinnerVorn, Spieler gewinnerHinten, Spieler verliererVorn, Spieler verliererHinten, short toreVerlierer) {
        this.gewinnerVorn = gewinnerVorn;
        this.gewinnerHinten = gewinnerHinten;
        this.verliererVorn = verliererVorn;
        this.verliererHinten = verliererHinten;
        this.toreVerlierer = toreVerlierer;
    }

    public long getId() {
        return id;
    }

    public short getToreVerlierer() {
        return toreVerlierer;
    }

    public void setToreVerlierer(short toreVerlierer) {
        this.toreVerlierer = toreVerlierer;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Spieler getVerliererHinten() {
        return verliererHinten;
    }

    public void setVerliererHinten(Spieler verliererHinten) {
        this.verliererHinten = verliererHinten;
    }

    public Spieler getVerliererVorn() {
        return verliererVorn;
    }

    public void setVerliererVorn(Spieler verliererVorn) {
        this.verliererVorn = verliererVorn;
    }

    public Spieler getGewinnerHinten() {
        return gewinnerHinten;
    }

    public void setGewinnerHinten(Spieler gewinnerHinten) {
        this.gewinnerHinten = gewinnerHinten;
    }

    public Spieler getGewinnerVorn() {
        return gewinnerVorn;
    }

    public void setGewinnerVorn(Spieler gewinnerVorn) {
        this.gewinnerVorn = gewinnerVorn;
    }
}
