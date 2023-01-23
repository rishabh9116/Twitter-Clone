/**
 * This class is generated by jOOQ
 */
package tech.codingclub.helix.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodersRecord extends org.jooq.impl.TableRecordImpl<tech.codingclub.helix.tables.records.CodersRecord> implements org.jooq.Record2<java.lang.Long, java.lang.String> {

	private static final long serialVersionUID = -352571511;

	/**
	 * Setter for <code>public.coders.age</code>.
	 */
	public void setAge(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.coders.age</code>.
	 */
	public java.lang.Long getAge() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.coders.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.coders.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Long, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Long, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return tech.codingclub.helix.tables.Coders.CODERS.AGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return tech.codingclub.helix.tables.Coders.CODERS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getAge();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CodersRecord value1(java.lang.Long value) {
		setAge(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CodersRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CodersRecord values(java.lang.Long value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CodersRecord
	 */
	public CodersRecord() {
		super(tech.codingclub.helix.tables.Coders.CODERS);
	}

	/**
	 * Create a detached, initialised CodersRecord
	 */
	public CodersRecord(java.lang.Long age, java.lang.String name) {
		super(tech.codingclub.helix.tables.Coders.CODERS);

		setValue(0, age);
		setValue(1, name);
	}
}
