import { BaseEntity } from './../../shared';

export class Post implements BaseEntity {
    constructor(
        public id?: string,
        public title?: string,
        public content?: any,
        public category?: string,
    ) {
    }
}
