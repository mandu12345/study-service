package com.study.user.controller;

import com.study.user.dto.MannerScoreResponse;
import com.study.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/manners")
@RequiredArgsConstructor
public class MannerController {

    private final UserService userService;

    // ============================
    // GET /api/manners/{userId}
    // 매너 점수 조회
    // ============================
    @GetMapping("/{userId}")
    public ResponseEntity<MannerScoreResponse> getMannerScore(@PathVariable Long userId) {
        MannerScoreResponse response = userService.getMannerScore(userId);
        return ResponseEntity.ok(response);
    }
}