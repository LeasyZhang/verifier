package com.archiver.verifier.entity;

import com.archiver.verifier.constant.DirectionType;
import com.archiver.verifier.constant.ItemStatus;
import com.archiver.verifier.constant.ItemType;
import com.archiver.verifier.constant.StorageConstant;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@Entity
@Table(name = "rc_item_0", indexes = {@Index(columnList = "ownerId,createTime,type,direction,storage,status,fromNumber,toNumber", name = "idx_full_col")})
public class RcItem  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long jobId;

    private long ownerId;

    private String url;

    private String fromNumber;

    private String toNumber;

    private int fromExtensionNum;

    private int toExtensionNum;

    private long extensionId;

    @Enumerated
    private DirectionType direction;

    private Instant generateTime;

    @Enumerated
    private StorageConstant storage;

    @Enumerated
    private ItemStatus status;

    @Enumerated
    private ItemType type;

    private int autoRetryCount;

    private int manualRetryCount;

    private Instant archiveTime;

    private Instant updateTime;

    private Instant createTime;

    private long exceptionCategoryId;


    @Override
    public String toString() {
        return "RcItem{" +
                "id=" + id +
                ", jobId=" + jobId +
                ", ownerId=" + ownerId +
                ", url='" + url + '\'' +
                ", fromNumber='" + fromNumber + '\'' +
                ", toNumber='" + toNumber + '\'' +
                ", fromExtensionNum=" + fromExtensionNum +
                ", toExtensionNum=" + toExtensionNum +
                ", extensionId=" + extensionId +
                ", direction=" + direction +
                ", generateTime=" + generateTime +
                ", storage=" + storage +
                ", status=" + status +
                ", type=" + type +
                ", autoRetryCount=" + autoRetryCount +
                ", manualRetryCount=" + manualRetryCount +
                ", archiveTime=" + archiveTime +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                ", exceptionCategoryId=" + exceptionCategoryId +
                '}';
    }
}
