package at.fh.swengb.guardianlist.model;

import java.io.Serializable;

/**
 * Created by Martin on 19.11.2016.
 */

public class Guardian implements Serializable {

    private String name;
    private String pantheon;
    private String description;
    private String ultimate;
    private int baseHealth;
    private int baseMana;
    private int magicalPower;
    private boolean newInGame;
    private String pantheonLocation;
    private String phoneNumber;

    public Guardian() {
    }

    public Guardian(String name, String pantheon, String description, String ultimate, int baseMana, int baseHealth, int magicalPower, boolean newInGame, String pantheonLocation, String phoneNumber) {
        this.name = name;
        this.pantheon = pantheon;
        this.description = description;
        this.ultimate = ultimate;
        this.baseMana = baseMana;
        this.baseHealth = baseHealth;
        this.magicalPower = magicalPower;
        this.newInGame = newInGame;
        this.pantheonLocation = pantheonLocation;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guardian guardian = (Guardian) o;

        if (name != null ? !name.equals(guardian.name) : guardian.name != null) return false;
        if (pantheon != null ? !pantheon.equals(guardian.pantheon) : guardian.pantheon != null)
            return false;
        return description != null ? description.equals(guardian.description) : guardian.description == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (pantheon != null ? pantheon.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPantheon() {
        return pantheon;
    }

    public void setPantheon(String pantheon) {
        this.pantheon = pantheon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUltimate() {
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    public int getBaseMana() {
        return baseMana;
    }

    public void setBaseMana(int baseMana) {
        this.baseMana = baseMana;
    }

    public int getMagicalPower() {
        return magicalPower;
    }

    public void setMagicalPower(int magicalPower) {
        this.magicalPower = magicalPower;
    }

    public boolean isNewInGame() {
        return newInGame;
    }

    public void setNewInGame(boolean newInGame) {
        this.newInGame = newInGame;
    }

    public String getPantheonLocation() {
        return pantheonLocation;
    }

    public void setPantheonLocation(String pantheonLocation) {
        this.pantheonLocation = pantheonLocation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(name).append(" ")
                .append('\n')
                .append(pantheonLocation).append('\n')
                .append(phoneNumber);
        return sb.toString();
    }
}
