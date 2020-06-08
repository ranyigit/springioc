package com.tv189.service.impl;

import com.tv189.dao.IAccountDao;
import com.tv189.domain.Account;
import com.tv189.service.IAccountService;

import java.util.List;

public class AccountServiceImpl  implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAllById(Integer accountId) {
        return accountDao.findAllById(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
