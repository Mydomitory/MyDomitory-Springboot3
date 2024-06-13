package com.jin.MyDomitory.dto.board;

import com.jin.MyDomitory.domain.Board;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class BoardResponse {
    private Long id;
    private Long userId;
    private String type;
    private String title;
    private String content;
    private LocalDateTime creadtedAt;

    public BoardResponse(Board board){
        this.id=board.getId();
        this.userId=board.getUserId();
        this.type=board.getType();
        this.title=board.getTitle();
        this.content=board.getContent();
        this.creadtedAt=board.getCreatedAt();
    }
}
