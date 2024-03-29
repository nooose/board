package com.project.board.config;

import com.project.board.domain.UserAccount;
import com.project.board.dto.UserAccountDto;
import com.project.board.repository.UserAccountRepository;
import com.project.board.service.UserAccountService;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@Import(SecurityConfig.class)
public class TestSecurityConfig {
    @MockBean private UserAccountService userAccountService;

    @BeforeTestMethod
    public void securitySetup() {
        given(userAccountService.searchUser(anyString()))
                .willReturn(Optional.of(createUserAccountDto()));
        given(userAccountService.saveUser(anyString(), anyString(), anyString(), anyString(), anyString()))
                .willReturn(createUserAccountDto());
    }

    private static UserAccountDto createUserAccountDto() {
        return UserAccountDto.of(
                "nooseTest",
                "pw",
                "noose-test@email.com",
                "noose-test",
                "test memo"
        );
    }

}
