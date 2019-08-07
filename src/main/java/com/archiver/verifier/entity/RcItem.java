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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "jobid")
    private long jobId;

    @Column(name = "ownerid")
    private long ownerId;

    @Column(name = "url")
    private String url;

    @Column(name = "fromnumber")
    private String fromNumber;

    @Column(name = "tonumber")
    private String toNumber;

    @Column(name = "fromextensionnum")
    private int fromExtensionNum;

    @Column(name = "toextensionnum")
    private int toExtensionNum;

    @Column(name = "extensionid")
    private long extensionId;

    @Enumerated
    @Column(name = "direction")
    private DirectionType direction;

    @Column(name = "generatetime")
    private Instant generateTime;

    @Enumerated
    @Column(name = "storage")
    private StorageConstant storage;

    @Enumerated
    @Column(name = "status")
    private ItemStatus status;

    @Enumerated
    @Column(name = "type")
    private ItemType type;

    @Column(name = "autoretrycount")
    private int autoRetryCount;

    @Column(name = "manualretrycount")
    private int manualRetryCount;

    @Column(name = "archivetime")
    private Instant archiveTime;

    @Column(name = "updatetime")
    private Instant updateTime;

    @Column(name = "createtime")
    private Instant createTime;

    @Column(name = "exceptioncategoryid")
    private long exceptionCategoryId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFromNumber() {
        return fromNumber;
    }

    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }

    public String getToNumber() {
        return toNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public int getFromExtensionNum() {
        return fromExtensionNum;
    }

    public void setFromExtensionNum(int fromExtensionNum) {
        this.fromExtensionNum = fromExtensionNum;
    }

    public int getToExtensionNum() {
        return toExtensionNum;
    }

    public void setToExtensionNum(int toExtensionNum) {
        this.toExtensionNum = toExtensionNum;
    }

    public long getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(long extensionId) {
        this.extensionId = extensionId;
    }

    public DirectionType getDirection() {
        return direction;
    }

    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }

    public Instant getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Instant generateTime) {
        this.generateTime = generateTime;
    }

    public StorageConstant getStorage() {
        return storage;
    }

    public void setStorage(StorageConstant storage) {
        this.storage = storage;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getAutoRetryCount() {
        return autoRetryCount;
    }

    public void setAutoRetryCount(int autoRetryCount) {
        this.autoRetryCount = autoRetryCount;
    }

    public int getManualRetryCount() {
        return manualRetryCount;
    }

    public void setManualRetryCount(int manualRetryCount) {
        this.manualRetryCount = manualRetryCount;
    }

    public Instant getArchiveTime() {
        return archiveTime;
    }

    public void setArchiveTime(Instant archiveTime) {
        this.archiveTime = archiveTime;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public long getExceptionCategoryId() {
        return exceptionCategoryId;
    }

    public void setExceptionCategoryId(long exceptionCategoryId) {
        this.exceptionCategoryId = exceptionCategoryId;
    }

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
