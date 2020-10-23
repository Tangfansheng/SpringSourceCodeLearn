package com.ordo.entity;

import lombok.Data;
import org.springframework.context.annotation.Lazy;

@Data
@Lazy
public class PetStore {
    private AccountDao accountDao;
    private ItemDao itemDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public ItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @Override
    public String toString() {
        return "PetStore{" +
                "accountDao=" + accountDao.getUid() +
                ", itemDao=" + itemDao.getUid() +
                '}';
    }
}
