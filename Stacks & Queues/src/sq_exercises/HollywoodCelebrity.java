/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

/**
 *
 * @author ogm2
 */
public class HollywoodCelebrity implements Comparable{
    
    String firstName;
    String lastName;
    int yearOfBirth;
    
    public HollywoodCelebrity(){}
    
    public HollywoodCelebrity(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HollywoodCelebrity other = (HollywoodCelebrity) obj;
        if (this.firstName.compareTo(other.firstName) != 0) {
            return false;
        }
        if (this.lastName.compareTo(other.lastName) != 0) {
            return false;
        }
        if (this.yearOfBirth != other.yearOfBirth) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + yearOfBirth + "\n";
    }
    

    @Override
    public int compareTo(Object o) {
        HollywoodCelebrity p = (HollywoodCelebrity) o;
        int result = this.firstName.compareTo(p.firstName);
        if (result == 0)
            result = this.lastName.compareTo(p.lastName);
        if (result == 0)
            result = p.yearOfBirth - this.yearOfBirth;
        return result;
    }
    
    
    
}
