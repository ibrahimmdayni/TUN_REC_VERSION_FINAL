/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UTIL;

/**
 *
 * @author ibrahim
 */
public class DATE {
    private int DAY;
    private int MONTH;
    private int YEAR;

    public DATE() {
    }

    public DATE(int DAY, int MONTH, int YEAR) {
        this.DAY = DAY;
        this.MONTH = MONTH;
        this.YEAR = YEAR;
    }

    public int getDAY() {
        return DAY;
    }

    /**
     * @param DAY the DAY to set
     */
    public void setDAY(int DAY) {
        this.DAY = DAY;
    }

    /**
     * @return the MONTH
     */
    public int getMONTH() {
        return MONTH;
    }

    /**
     * @param MONTH the MONTH to set
     */
    public void setMONTH(int MONTH) {
        this.MONTH = MONTH;
    }

    /**
     * @return the YEAR
     */
    public int getYEAR() {
        return YEAR;
    }

    /**
     * @param YEAR the YEAR to set
     */
    public void setYEAR(int YEAR) {
        this.YEAR = YEAR;
    }

    @Override
    public String toString() {
        return "DATE{" + "DAY=" + DAY + ", MONTH=" + MONTH + ", YEAR=" + YEAR + '}';
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DATE other = (DATE) obj;
        if (this.DAY != other.DAY) {
            return false;
        }
        if (this.MONTH != other.MONTH) {
            return false;
        }
        if (this.YEAR != other.YEAR) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.DAY;
        hash = 17 * hash + this.MONTH;
        hash = 17 * hash + this.YEAR;
        return hash;
    }

    
    
}
