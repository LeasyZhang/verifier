package com.archiver.verifier.repo;

import com.archiver.verifier.constant.DirectionType;
import com.archiver.verifier.constant.ItemStatus;
import com.archiver.verifier.constant.ItemType;
import com.archiver.verifier.constant.StorageConstant;
import com.archiver.verifier.entity.RcItem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RcItemRepositoryTest {

    @Autowired
    private RcItemRepository rcItemRepository;

    @Test
    public void select() {
        Optional<RcItem> item = rcItemRepository.findById(37L);
        Assert.assertEquals(false, item.isPresent());
    }

    @Test
    @Rollback
    public void save() {
        RcItem rcItem = new RcItem();

        rcItem.setJobId(6666L);
        rcItem.setOwnerId(292L);
        rcItem.setStatus(ItemStatus.ALL);
        rcItem.setAutoRetryCount(3);
        rcItem.setManualRetryCount(12);
        rcItem.setStorage(StorageConstant.DRIVE);
        rcItem.setType(ItemType.CALLRECORDING);
        rcItem.setUrl("www.baidu.com");
        rcItem.setUpdateTime(Instant.now().plusMillis(-11111));
        rcItem.setArchiveTime(Instant.now());
        rcItem.setCreateTime(Instant.now());
        rcItem.setGenerateTime(Instant.now());
        rcItem.setExceptionCategoryId(300L);
        rcItem.setExtensionId(34432L);
        rcItem.setDirection(DirectionType.INBOUND);

        rcItemRepository.save(rcItem);
    }
}