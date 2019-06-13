# Football-Clubs
Java + Hibernate exercise (PostgresQL db)

DB script:

CREATE TABLE public.clubs
(
    id integer NOT NULL DEFAULT nextval('clubs_id_seq'::regclass),
    name character varying COLLATE pg_catalog."default",
    CONSTRAINT clubs_pk PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

CREATE TABLE public.players
(
    id integer NOT NULL DEFAULT nextval('players_id_seq'::regclass),
    surname character varying COLLATE pg_catalog."default",
    age integer,
    club_id integer,
    CONSTRAINT players_pk PRIMARY KEY (id),
    CONSTRAINT players_clubs_id_fk FOREIGN KEY (club_id)
        REFERENCES public.clubs (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

hibernate.cfg.xml ('resources' folder):

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD//EN"
        "http://hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
        <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/YOUR_DB_NAME</property>
        <property name="hibernate.connection.username">YOUR_USERNAME</property>
        <property name="hibernate.connection.password">YOUR_PASSWORD</property>
        <property name="hibernate.dialect">org.hibernate.dialect.PostgreSQL9Dialect</property>
        <property name="hibernate.show_sql">true</property>
    </session-factory>
</hibernate-configuration>
