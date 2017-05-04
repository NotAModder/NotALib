package notamodder.notalib.item;

/**
 * This interface is used by items to list out variants that they have. This is used by
 * internal systems to make handling variant items easier.
 */
public interface IVariant {

    /**
     * An array of strings which represent the variants for an item. They should be in the
     * order of meta, with meta 0 being the first entry, and so on.
     *
     * @return An array of strings which represent the variants for an item.
     */
    public String[] getVariant ();

    /**
     * Gets a string which is used to prefix the variants. For example, if you want to have
     * several fish, you could have fish be the prefix, and the type of fish be the variant
     * name.
     *
     * @return The prefix to add to the variant name.
     */
    public default String getPrefix () {

        return "";
    }
}