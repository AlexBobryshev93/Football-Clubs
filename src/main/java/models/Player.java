package models;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String surname;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "club_id")
    private Club club;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Player(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", club=" + club +
                '}';
    }
}
