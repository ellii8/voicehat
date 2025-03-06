package com.example.voicehat.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "voice_channels")
public class VoiceChannel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<User> users;
}
