package edu.ak.hibernate;



import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "students_new1")
public class Student {

    public Student(){
        
    }
    public Student(String firstName, String lastName, String email) {
      
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
       
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    
    @Column(name = "presentationDate")
    @Temporal(TemporalType.DATE) 
    private Date  date;

    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date  getDate() {
        return date;
    }

    public void setDate(Date  date) {
        this.date = date;
    }
    
}
