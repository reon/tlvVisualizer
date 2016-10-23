package at.innovative_solutions.tlv;

public interface ValueDecoder {
	public String getName(final TLV tlv);
	public String toString(final TLV tlv); // TODO better name
	public byte[] toValue(final String str, final TLV tlv);
	public String getFormat(final TLV tlv);
}