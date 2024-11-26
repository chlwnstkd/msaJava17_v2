package kopo.poly.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public record NoticeDTO(
        Long noticeSeq,
        String title,
        String noticeYn,
        String contents,
        String userId,
        String readCnt,
        String regId,
        String regDt,
        String chgId,
        String chgDt,
        String userName
) {
    /**
     * @param pDTO   복사할 DTO 객체
     * @param userId 추가 저장할 회원아이디
     * @return 회원아이디가 추가된 {@link NoticeDTO } 객체
     */
    public static NoticeDTO addUserId(NoticeDTO pDTO, String userId) {

        NoticeDTO dto = NoticeDTO.builder()
                .noticeSeq(pDTO.noticeSeq())
                .title(pDTO.title())
                .noticeYn(pDTO.noticeYn())
                .contents(pDTO.contents())
                .userId(userId)
                .readCnt(pDTO.readCnt())
                .regId(pDTO.regId())
                .regDt(pDTO.regDt())
                .chgId(pDTO.chgId())
                .chgDt(pDTO.chgDt())
                .build();

        return dto;
    }
}

