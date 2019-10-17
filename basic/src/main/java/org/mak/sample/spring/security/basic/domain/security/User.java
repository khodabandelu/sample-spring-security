package org.mak.sample.spring.security.basic.domain.security;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "core_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, length = 50, nullable = false)
    private String username;

    @Column(name = "password_hash", length = 60, nullable = false)
    private String password;

}
