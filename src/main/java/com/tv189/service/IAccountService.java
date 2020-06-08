package com.tv189.service;

import com.tv189.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {

    /**
     * 查询所有账号
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
     * @return
     */
    Account findAllById(Integer accountId);

    /**
     * 保存
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更细
     * @param account
     */
    void updateAccount(Account account);

    void deleteAccount(Integer accountId);
}
