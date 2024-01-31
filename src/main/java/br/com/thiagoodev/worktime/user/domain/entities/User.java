package br.com.thiagoodev.worktime.user.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class User {
    private UUID uuid;
    private String username;
    private String email;
    private LocalDateTime created;
    private LocalDateTime modified;
}
