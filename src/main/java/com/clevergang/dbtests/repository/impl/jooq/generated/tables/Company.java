/**
 * This class is generated by jOOQ
 */
package com.clevergang.dbtests.repository.impl.jooq.generated.tables;


import com.clevergang.dbtests.repository.impl.jooq.generated.Keys;
import com.clevergang.dbtests.repository.impl.jooq.generated.Public;
import com.clevergang.dbtests.repository.impl.jooq.generated.tables.records.CompanyRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Company extends TableImpl<CompanyRecord> {

	private static final long serialVersionUID = 1716149025;

	/**
	 * The reference instance of <code>public.company</code>
	 */
	public static final Company COMPANY = new Company();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CompanyRecord> getRecordType() {
		return CompanyRecord.class;
	}

	/**
	 * The column <code>public.company.pid</code>.
	 */
	public final TableField<CompanyRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.company.name</code>.
	 */
	public final TableField<CompanyRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

	/**
	 * The column <code>public.company.address</code>.
	 */
	public final TableField<CompanyRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * Create a <code>public.company</code> table reference
	 */
	public Company() {
		this("company", null);
	}

	/**
	 * Create an aliased <code>public.company</code> table reference
	 */
	public Company(String alias) {
		this(alias, COMPANY);
	}

	private Company(String alias, Table<CompanyRecord> aliased) {
		this(alias, aliased, null);
	}

	private Company(String alias, Table<CompanyRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<CompanyRecord, Integer> getIdentity() {
		return Keys.IDENTITY_COMPANY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CompanyRecord> getPrimaryKey() {
		return Keys.COMPANY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CompanyRecord>> getKeys() {
		return Arrays.<UniqueKey<CompanyRecord>>asList(Keys.COMPANY_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Company as(String alias) {
		return new Company(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Company rename(String name) {
		return new Company(name, null);
	}
}
