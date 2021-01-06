package com.robin.it.module;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserNameEnIsNull() {
            addCriterion("USER_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andUserNameEnIsNotNull() {
            addCriterion("USER_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEnEqualTo(String value) {
            addCriterion("USER_NAME_EN =", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotEqualTo(String value) {
            addCriterion("USER_NAME_EN <>", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnGreaterThan(String value) {
            addCriterion("USER_NAME_EN >", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME_EN >=", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnLessThan(String value) {
            addCriterion("USER_NAME_EN <", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME_EN <=", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnLike(String value) {
            addCriterion("USER_NAME_EN like", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotLike(String value) {
            addCriterion("USER_NAME_EN not like", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnIn(List<String> values) {
            addCriterion("USER_NAME_EN in", values, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotIn(List<String> values) {
            addCriterion("USER_NAME_EN not in", values, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnBetween(String value1, String value2) {
            addCriterion("USER_NAME_EN between", value1, value2, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotBetween(String value1, String value2) {
            addCriterion("USER_NAME_EN not between", value1, value2, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnIsNull() {
            addCriterion("USER_NAME_CN is null");
            return (Criteria) this;
        }

        public Criteria andUserNameCnIsNotNull() {
            addCriterion("USER_NAME_CN is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameCnEqualTo(String value) {
            addCriterion("USER_NAME_CN =", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnNotEqualTo(String value) {
            addCriterion("USER_NAME_CN <>", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnGreaterThan(String value) {
            addCriterion("USER_NAME_CN >", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME_CN >=", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnLessThan(String value) {
            addCriterion("USER_NAME_CN <", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME_CN <=", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnLike(String value) {
            addCriterion("USER_NAME_CN like", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnNotLike(String value) {
            addCriterion("USER_NAME_CN not like", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnIn(List<String> values) {
            addCriterion("USER_NAME_CN in", values, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnNotIn(List<String> values) {
            addCriterion("USER_NAME_CN not in", values, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnBetween(String value1, String value2) {
            addCriterion("USER_NAME_CN between", value1, value2, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnNotBetween(String value1, String value2) {
            addCriterion("USER_NAME_CN not between", value1, value2, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNull() {
            addCriterion("OFFICE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNotNull() {
            addCriterion("OFFICE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneEqualTo(String value) {
            addCriterion("OFFICE_PHONE =", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotEqualTo(String value) {
            addCriterion("OFFICE_PHONE <>", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThan(String value) {
            addCriterion("OFFICE_PHONE >", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_PHONE >=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThan(String value) {
            addCriterion("OFFICE_PHONE <", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_PHONE <=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLike(String value) {
            addCriterion("OFFICE_PHONE like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotLike(String value) {
            addCriterion("OFFICE_PHONE not like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIn(List<String> values) {
            addCriterion("OFFICE_PHONE in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotIn(List<String> values) {
            addCriterion("OFFICE_PHONE not in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneBetween(String value1, String value2) {
            addCriterion("OFFICE_PHONE between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotBetween(String value1, String value2) {
            addCriterion("OFFICE_PHONE not between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneIsNull() {
            addCriterion("CELL_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneIsNotNull() {
            addCriterion("CELL_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneEqualTo(String value) {
            addCriterion("CELL_PHONE =", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotEqualTo(String value) {
            addCriterion("CELL_PHONE <>", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneGreaterThan(String value) {
            addCriterion("CELL_PHONE >", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CELL_PHONE >=", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneLessThan(String value) {
            addCriterion("CELL_PHONE <", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneLessThanOrEqualTo(String value) {
            addCriterion("CELL_PHONE <=", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneLike(String value) {
            addCriterion("CELL_PHONE like", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotLike(String value) {
            addCriterion("CELL_PHONE not like", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneIn(List<String> values) {
            addCriterion("CELL_PHONE in", values, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotIn(List<String> values) {
            addCriterion("CELL_PHONE not in", values, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneBetween(String value1, String value2) {
            addCriterion("CELL_PHONE between", value1, value2, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotBetween(String value1, String value2) {
            addCriterion("CELL_PHONE not between", value1, value2, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("LANGUAGE =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("LANGUAGE <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("LANGUAGE >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("LANGUAGE <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("LANGUAGE like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("LANGUAGE not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("LANGUAGE in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("LANGUAGE not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("LANGUAGE between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("LANGUAGE not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("PHOTO =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("PHOTO <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("PHOTO >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("PHOTO <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("PHOTO <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("PHOTO like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("PHOTO not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("PHOTO in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("PHOTO not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("PHOTO between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("PHOTO not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNull() {
            addCriterion("ADDRESS1 is null");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNotNull() {
            addCriterion("ADDRESS1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress1EqualTo(String value) {
            addCriterion("ADDRESS1 =", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotEqualTo(String value) {
            addCriterion("ADDRESS1 <>", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThan(String value) {
            addCriterion("ADDRESS1 >", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS1 >=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThan(String value) {
            addCriterion("ADDRESS1 <", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThanOrEqualTo(String value) {
            addCriterion("ADDRESS1 <=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Like(String value) {
            addCriterion("ADDRESS1 like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotLike(String value) {
            addCriterion("ADDRESS1 not like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1In(List<String> values) {
            addCriterion("ADDRESS1 in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotIn(List<String> values) {
            addCriterion("ADDRESS1 not in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Between(String value1, String value2) {
            addCriterion("ADDRESS1 between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotBetween(String value1, String value2) {
            addCriterion("ADDRESS1 not between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress2IsNull() {
            addCriterion("ADDRESS2 is null");
            return (Criteria) this;
        }

        public Criteria andAddress2IsNotNull() {
            addCriterion("ADDRESS2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress2EqualTo(String value) {
            addCriterion("ADDRESS2 =", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotEqualTo(String value) {
            addCriterion("ADDRESS2 <>", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThan(String value) {
            addCriterion("ADDRESS2 >", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS2 >=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThan(String value) {
            addCriterion("ADDRESS2 <", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThanOrEqualTo(String value) {
            addCriterion("ADDRESS2 <=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Like(String value) {
            addCriterion("ADDRESS2 like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotLike(String value) {
            addCriterion("ADDRESS2 not like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2In(List<String> values) {
            addCriterion("ADDRESS2 in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotIn(List<String> values) {
            addCriterion("ADDRESS2 not in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Between(String value1, String value2) {
            addCriterion("ADDRESS2 between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotBetween(String value1, String value2) {
            addCriterion("ADDRESS2 not between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnIsNull() {
            addCriterion("CREATOR_NAME_CN is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnIsNotNull() {
            addCriterion("CREATOR_NAME_CN is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnEqualTo(String value) {
            addCriterion("CREATOR_NAME_CN =", value, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnNotEqualTo(String value) {
            addCriterion("CREATOR_NAME_CN <>", value, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnGreaterThan(String value) {
            addCriterion("CREATOR_NAME_CN >", value, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR_NAME_CN >=", value, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnLessThan(String value) {
            addCriterion("CREATOR_NAME_CN <", value, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnLessThanOrEqualTo(String value) {
            addCriterion("CREATOR_NAME_CN <=", value, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnLike(String value) {
            addCriterion("CREATOR_NAME_CN like", value, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnNotLike(String value) {
            addCriterion("CREATOR_NAME_CN not like", value, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnIn(List<String> values) {
            addCriterion("CREATOR_NAME_CN in", values, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnNotIn(List<String> values) {
            addCriterion("CREATOR_NAME_CN not in", values, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnBetween(String value1, String value2) {
            addCriterion("CREATOR_NAME_CN between", value1, value2, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameCnNotBetween(String value1, String value2) {
            addCriterion("CREATOR_NAME_CN not between", value1, value2, "creatorNameCn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnIsNull() {
            addCriterion("CREATOR_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnIsNotNull() {
            addCriterion("CREATOR_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnEqualTo(String value) {
            addCriterion("CREATOR_NAME_EN =", value, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnNotEqualTo(String value) {
            addCriterion("CREATOR_NAME_EN <>", value, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnGreaterThan(String value) {
            addCriterion("CREATOR_NAME_EN >", value, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR_NAME_EN >=", value, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnLessThan(String value) {
            addCriterion("CREATOR_NAME_EN <", value, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnLessThanOrEqualTo(String value) {
            addCriterion("CREATOR_NAME_EN <=", value, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnLike(String value) {
            addCriterion("CREATOR_NAME_EN like", value, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnNotLike(String value) {
            addCriterion("CREATOR_NAME_EN not like", value, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnIn(List<String> values) {
            addCriterion("CREATOR_NAME_EN in", values, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnNotIn(List<String> values) {
            addCriterion("CREATOR_NAME_EN not in", values, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnBetween(String value1, String value2) {
            addCriterion("CREATOR_NAME_EN between", value1, value2, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEnNotBetween(String value1, String value2) {
            addCriterion("CREATOR_NAME_EN not between", value1, value2, "creatorNameEn");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("CREATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("CREATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("CREATE_DATETIME =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("CREATE_DATETIME <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("CREATE_DATETIME >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATETIME >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("CREATE_DATETIME <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATETIME <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("CREATE_DATETIME in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("CREATE_DATETIME not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATETIME between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATETIME not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}