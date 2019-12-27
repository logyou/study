package algorithms.bplustee;

/**
 * 条目
 *
 * @author lyh
 * @date 2019/12/25 0025
 **/
public class Entry<K, V> {
    /**
     * 键
     */
    private K key;
    /**
     * 值
     */
    private V value;
    /**
     * 子节点
     */
    private Node<K, V> child;
}
