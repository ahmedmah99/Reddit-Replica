package com.ScalableTeam.models.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReportUserBody {
    private String userId;
    private String reportedUserId;
    private String reason;
}
