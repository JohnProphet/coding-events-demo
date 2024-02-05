package org.launchcode.codingevents.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Examples {
}

// DATA MANAGEMENT

// Connecting Repository to Code
@Autowired
private ArtworkRepository artworkRepository;


//turn object into entity class:

@Entity
public class Artwork {
    @Id
    @GeneratedValue
    private int id;
}

// STUDIO STEPS:

//Event & EventCategory both contain id, getId, equals, hashCode, name

1 Create AbstractEntity class in models
        (inside class: public abstract class AbstractEntity {})

2. In Event class extends