class LRUCache {
    cache: Map<number,number>;
    capacity: number;
    constructor(capacity: number) {
          this.cache = new Map();
          this.capacity = capacity;
    }

    get(key: number): number {
      const value = this.cache.get(key);
      if(this.cache.has(key)) {
            this.cache.delete(key);
            this.cache.set(key, value!!);
      }
      return value ?? -1;
    }

    put(key: number, value: number): void {
          const v = this.cache.get(key);
          if(this.cache.has(key)) {
            this.cache.delete(key);
          }
          else if(this.capacity === this.cache.size) {
            const first = this.cache.entries().next().value;
            this.cache.delete(first[0]);
          }
          this.cache.set(key, value);
    }
}
